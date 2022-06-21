import { Pipe, PipeTransform } from '@angular/core';
import { Contact } from '../models/Contact';

@Pipe({
  name: 'search'
})

// Implement logic to filter the given contacts based on given searchText
// Convert text to lowercase
export class SearchPipe implements PipeTransform {
  transform(value: Contact[], searchText:string): Contact[] {
    if(value.length===0 || searchText===""){
      return value
    }
    const cont=[];
    for(const val of value){
    if(val.name.includes(searchText) || val.mobile.toString().includes(searchText)){
      cont.push(val);
    }}
    return cont;
  }
}
