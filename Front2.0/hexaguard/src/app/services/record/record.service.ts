import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable, map } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/app/shared/enviorement/enviorement';
import { Record } from './interface/model/Record';

@Injectable({
  providedIn: 'root'
})
export class RecordService {
  private apiUrl: string = environment.apiUrl + "/records";

  private readonly records: BehaviorSubject<Record[]> = new BehaviorSubject<
    Record[]
  >([]);

  public records$: Observable<Record[]> = this.records.asObservable();

  constructor(private http: HttpClient) {
  }

  ngOnInit() {}

  getRecords() {
    this.http
      .get<Record[]>(this.apiUrl + "/")
      .subscribe({
        next: (recordsList: Record[]) => this.records.next(recordsList),
        error: (error: any) => console.error('Error: ' + error)
      });
  }


}
