import { Ilabel } from "../Ilabel";
import { IlabelContract } from "../contract/IlabelContract";

export class Label implements Ilabel {
  id: number;
  name: string;
  colorCode: string;

  constructor(labelContract: IlabelContract){
    this.id = labelContract.id;
    this.name = labelContract.name;
    this.colorCode = labelContract.colorCode;
  }

}
