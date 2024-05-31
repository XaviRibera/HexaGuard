import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListRecordItemComponent } from './list-record-item.component';

describe('ListRecordItemComponent', () => {
  let component: ListRecordItemComponent;
  let fixture: ComponentFixture<ListRecordItemComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListRecordItemComponent]
    });
    fixture = TestBed.createComponent(ListRecordItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
