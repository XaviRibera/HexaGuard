import { IrecordContract } from "../contract/IrecordContract";
import { Record } from "./Record";

export class RecordList {
  all: Record[] = [];
  filtered: Record[] = [];

  constructor(recordContractList: IrecordContract[]) {
    console.log(recordContractList);
    console.log(typeof recordContractList)
    this.all = recordContractList.map(
      recordContract => new Record(recordContract)
    )
    this.filtered = [...this.all];
  }
}
