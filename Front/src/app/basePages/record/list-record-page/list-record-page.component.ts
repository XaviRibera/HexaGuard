import { Component } from '@angular/core';
import { Subscription } from 'rxjs';
import { RecordService } from 'src/app/services/record/record.service';
import { Record } from 'src/app/services/record/interface/model/Record';
import { LabelService } from 'src/app/services/label/label.service';
import { Label } from 'src/app/services/label/interface/model/label';

@Component({
  selector: 'app-list-record-page',
  templateUrl: './list-record-page.component.html',
  styleUrls: ['./list-record-page.component.scss']
})
export class ListRecordPageComponent {
  RECORDS: Record[] = [];
  LABELS: Label[] = [];

  private labelServiceSubscription: Subscription | null = null;
  private recordServiceSubscription: Subscription | null = null;

  constructor( private labelService: LabelService, private recordService: RecordService) {}

  ngOnInit() {
    this.chargeDataBase();
  }

  private chargeDataBase() {
    this.labelService.getLabels();
    this.labelServiceSubscription = this.labelService.labels$.subscribe({
      next: (value: Label[]) => this.LABELS = value,
      error: (error) => console.error('Error: ' + error)
    })

    this.recordService.getRecords();
    this.recordServiceSubscription = this.recordService.records$.subscribe({
      next: (value: Record[]) => this.RECORDS = value,
      error: (error) => console.error('Error: ' + error)
    })
  }

  filterList(labelId: number): Record[] {
    return this.RECORDS.filter( record => record.labelId === labelId);
  }

  ngOnDestroy() {
    this.recordServiceSubscription?.unsubscribe();
    this.labelServiceSubscription?.unsubscribe();
  }
}
