import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RecordService {
  private apiRoute: string = 'http://localhost:8090/' + 'records/'

  
  constructor() { }
}
