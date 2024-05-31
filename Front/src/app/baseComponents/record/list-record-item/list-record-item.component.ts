import { Component, Input } from '@angular/core';
import { Record } from 'src/app/services/record/interface/model/Record';

@Component({
  selector: 'app-list-record-item',
  templateUrl: './list-record-item.component.html',
  styleUrls: ['./list-record-item.component.scss']
})
export class ListRecordItemComponent {
  @Input() record!: Record;
  panelOpenState = false;
}
