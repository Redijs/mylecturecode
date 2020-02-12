package lv.renata.repeatJavaClassOOP;

public class MyClassConstructor { 
	// vajadziigs, lai mainiigajiem padotu veertiibas. Bet defoltais konstruktors vajadziigs, lai riikotos ar klases instances mainiigajiem vai metodeem
	private long modelYear;
	private String modelName;

	public MyClassConstructor (){
		
	}
	
	public MyClassConstructor (long modelYear, String modelName){
		this.modelYear = modelYear;
		this.modelName = modelName;
		
		
	}

	public String getModelName() {
		return modelName;
	}
	
}
