import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './base-pages/app-routing.module';
import { AppComponent } from './app.component';
import { RecordComponent } from './base-pages/record/record.component';
import { ListRecordPageComponent } from './base-pages/record/list-record-page/list-record-page.component';
import { DetailRecordPageComponent } from './base-pages/record/detail-record-page/detail-record-page.component';

@NgModule({
  declarations: [
    AppComponent,
    RecordComponent,
    ListRecordPageComponent,
    DetailRecordPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
