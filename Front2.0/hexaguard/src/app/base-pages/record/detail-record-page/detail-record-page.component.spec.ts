import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetailRecordPageComponent } from './detail-record-page.component';

describe('DetailRecordPageComponent', () => {
  let component: DetailRecordPageComponent;
  let fixture: ComponentFixture<DetailRecordPageComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DetailRecordPageComponent]
    });
    fixture = TestBed.createComponent(DetailRecordPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
