import { Irecord } from "../Irecord";
import { IrecordContract } from "../contract/IrecordContract";

export class Record implements Irecord {
  id: number;
  title: string;
  pageDirection: string;
  userName: string;
  password: string;
  description: string;
  labelId: number;

  constructor(recordContract: IrecordContract) {
    this.id = recordContract.id;
    this.title = recordContract.title;
    this.pageDirection = recordContract.pageDirection;
    this.userName = recordContract.userName;
    this.password = recordContract.password;
    this.description = recordContract.description;
    this.labelId = recordContract.labelId;
  }
}
