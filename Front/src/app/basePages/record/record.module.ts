import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListRecordComponent } from './list-record/list-record.component';
import { RecordRoutingModule } from './record-routing.module';


@NgModule({
  declarations: [
    ListRecordComponent,

  ],
  imports: [
    CommonModule,
    RecordRoutingModule,
  ]
})
export class RecordModule { }
