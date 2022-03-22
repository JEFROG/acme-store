import {Observable} from 'rxjs';
import {Page} from "../entity/page";
import {Query} from "../entity/query";

export interface CrudOperations<T, ID> {

    post(t: T): Observable<T>;

    update(id: ID, t: T): Observable<T>;

    patch(id: ID, t: T): Observable<T>;

    get(id: ID): Observable<T>;

    getPage(): Observable<Page<T>>;

    query(query: Query): Observable<Page<T>>;

    delete(id: ID): Observable<any>;

}
