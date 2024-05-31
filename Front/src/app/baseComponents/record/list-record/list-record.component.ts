import { Component, Input } from '@angular/core';
import { Label } from 'src/app/services/label/interface/model/label';
import { Record } from 'src/app/services/record/interface/model/Record';

@Component({
  selector: 'app-list-record',
  templateUrl: './list-record.component.html',
  styleUrls: ['./list-record.component.scss']
})
export class ListRecordComponent {
  @Input() records: Record[] = [];
  @Input() label!: Label;


}
