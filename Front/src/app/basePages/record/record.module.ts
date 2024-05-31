import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RecordRoutingModule } from './record-routing.module';
import { ListRecordPageComponent } from './list-record-page/list-record-page.component';
import { HttpClientModule } from '@angular/common/http';
import { MatListModule } from '@Angular/material/list'
import { ListRecordComponent } from 'src/app/baseComponents/record/list-record/list-record.component';
import {MatExpansionModule} from '@angular/material/expansion';
import { ListRecordItemComponent } from 'src/app/baseComponents/record/list-record-item/list-record-item.component';
import {MatButtonModule} from '@angular/material/button';
import { RecordFormComponent } from './record-form/record-form.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';

@NgModule({
  declarations: [
    ListRecordComponent,
    ListRecordPageComponent,
    ListRecordItemComponent,
    RecordFormComponent,
  ],
  imports: [
    CommonModule,
    RecordRoutingModule,
    HttpClientModule,
    MatListModule,
    MatExpansionModule,
    MatButtonModule,
    MatInputModule,
    ReactiveFormsModule
  ]
})
export class RecordModule { }
