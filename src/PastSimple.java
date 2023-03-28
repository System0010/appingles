public class PastSimple extends Forms{
  String nameForm = "Past Simple";
  String[] surname = {"afirmative","negative","interrogative"}; 
  public String[] afirmativeForm = {"Subject","2ndColumn/-ed"};
  public String[] negativeForm = {"Subject","didn't","infinitive Verb"};
  public void aForm(){
    super.aForm(afirmativeForm);
  }
  public void aNegativeForm(){
    super.aForm(afirmativeForm);
  }
}
