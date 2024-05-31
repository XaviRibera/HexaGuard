import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable, catchError, throwError } from 'rxjs';
import { environment } from 'src/app/shared/enviorement/enviorement';
import { Label } from './interface/model/label';
import { HttpClient, HttpHeaders } from '@angular/common/http';

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

  getLabels() {
    this.http
      .get<Label[]>(this.apiUrl + '/')
      .subscribe({
        next: (labels: Label[]) => this.labels.next(labels),
        error: (error:any) => console.error('Error: ' + error)
      })
  }

  insertLabel(label: Label) {
    this.http.post('http://localhost:8090/labels/', label).subscribe({
      next: (result => console.log(result)),
      error: (error => throwError('Error: ' + error))
    })
  }
}
