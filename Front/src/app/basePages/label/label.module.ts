import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LabelRoutingModule } from './label-routing.module';
import { LabelFormComponent } from './label-form/label-form.component';
import { HttpClientModule } from '@angular/common/http';
import {MatInputModule} from '@angular/material/input';
import { ReactiveFormsModule } from '@angular/forms';
import {MatButtonModule} from '@angular/material/button';



@NgModule({
  declarations: [
    LabelFormComponent
  ],
  imports: [
    CommonModule,
    LabelRoutingModule,
    HttpClientModule,
    MatInputModule,
    ReactiveFormsModule,
    MatButtonModule,
  ]
})
export class LabelModule { }
