package swordTowardOffer;

public class Power {
	public static void main(String[] args) throws Exception {
		Power test = new Power();
		System.out.println(test.equal(0.0, 0.0));
		System.out.println(test.power(2, 32));
		
	}
	public double power(double base,int exponent) throws Exception{
		double result = 0.0;
		if(equal(base,0.0)&&exponent<0){
			throw new Exception("0的负数次幂没有意义");
		}
		if(exponent<0){
			//result = 1/absExponentPower(base, -exponent);
			result = 1/powerOlogn(base, -exponent);
		}else{
			//result = absExponentPower(base, exponent);
			result = powerOlogn(base, exponent);
		}
		return result;
		
	}
	public double absExponentPower(double base,int exponent){
		if(exponent==0){
			return 1;
		}
		double result = 1.0;
		for(int i=0;i<exponent;i++ ){
			result *=base;
		}
		return result;
	}
	public double powerOlogn(double base,int exponent){
		if(exponent ==0){
			return 1;
		}
		if(exponent==1){
			return base;
		}
		double result = powerOlogn(base, exponent >>1);
		result *= result;
		if((exponent&0x1)==1){
			result *= base;
		}
		return result;
	}
	public boolean equal(double num1,double num2){
		if((num1-num2)>-0.0000001&&(num1-num2)<0.0000001){
			return true;
		}
		else {
			return false;
		}
	}
}
