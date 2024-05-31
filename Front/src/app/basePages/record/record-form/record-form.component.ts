import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Subscription } from 'rxjs';
import { LabelService } from 'src/app/services/label/label.service';
import { RecordService } from 'src/app/services/record/record.service';

@Component({
  selector: 'app-record-form',
  templateUrl: './record-form.component.html',
  styleUrls: ['./record-form.component.scss']
})
export class RecordFormComponent {
  formValue!: any;
  succesSend = false;

  newRecordForm: FormGroup = this.formBuilder.group({
    title: [null, [Validators.required, Validators.maxLength(50)]],
    pageDirection: [null, [Validators.maxLength(200)]],
    userName: [null, [Validators.maxLength(50)]],
    password: [null, [Validators.required, Validators.maxLength(50)]],
    description: [null, [Validators.maxLength(300)]],
    labelId: [null]
  })

  private recordServiceSubscription: Subscription | null = null;
  private labelServiceSubscription: Subscription | null = null;

  constructor(
    private formBuilder: FormBuilder,
    private recordService: RecordService,
    private labelService: LabelService
  ) {}

  sendNewRecordInfo() {
    if(this.newRecordForm.invalid) return;
    this.formValue = this.newRecordForm.value;
    this.submitRecordInfo();
    this.succesPost();
  }

  private submitRecordInfo() {
    console.log(this.formValue);
  }

  private succesPost() {
    this.succesSend = true;
  }

  ngOnDestroy() {
    this.recordServiceSubscription?.unsubscribe();
    this.labelServiceSubscription?.unsubscribe();
  }
}
