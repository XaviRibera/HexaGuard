import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { environment } from 'src/app/shared/enviorement/enviorement';
import { Label } from './interface/model/label';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LabelService {
  private apiUrl: string = environment.apiUrl + '/labels'

  private readonly labels: BehaviorSubject<Label[]> = new BehaviorSubject<
    Label[]
  >([]);

  public labels$: Observable<Label[]> = this.labels.asObservable();

  constructor(private http: HttpClient) {
  }

  ngOnInit() {}

  getLabels() {
    this.http
      .get<Label[]>(this.apiUrl + '/')
      .subscribe({
        next: (labels: Label[]) => this.labels.next(labels),
        error: (error:any) => console.error('Error: ' + error)
      })
  }
}
