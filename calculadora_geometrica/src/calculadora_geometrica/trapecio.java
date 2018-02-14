package calculadora_geometrica;
//import java.util.Scanner;
public  class trapecio  implements magia{
	 private double basemenor;
	 private double basemayor;
	 private double altura;
     double areaTra;
public double getareaTra() 
{
    return areaTra;
}
@Override
public void areaTra() 
{
    areaTra = basemenor + basemayor/altura ;
}
double getAltura() {
	return altura;
}
void setAltura(double altura) {
	this.altura = altura;
}
double getBasemayor() {
	return basemayor;
}
void setBasemayor(double basemayor) {
	this.basemayor = basemayor;
}
double getBasemenor() {
	return basemenor;
}
void setBasemenor(double basemenor) {
	this.basemenor = basemenor;
}
void setBasemayor1(double basemayor) {
	this.basemayor = basemayor;
}
void setAltura1(double Altura) {
	this.altura = altura;
}
@Override
public void areaCua() {
	// TODO Auto-generated method stub
	
}
@Override
public void areaCirc() {
	// TODO Auto-generated method stub
	
}
@Override
public void areaTria() {
	// TODO Auto-generated method stub
	
}    

}

