public class Forms{
  public String name="nameOftime";
  String space=" ";
  String string;
  int indice;
  public void aForm(String[] form){
    for (String s : form) {
      indice = s.indexOf(s);
      string = s.toString();
      if(indice!=(-1)){//queremos saber cuando acaba el array para no escribir "+" 
      System.out.print(s);
      }else if(indice==-1){//problema aqui 
        System.out.println(" + ");
      }
    }
  };
}