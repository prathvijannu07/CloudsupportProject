package Utils;

import java.io.IOException;

public class simpletest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String instancesDropList = PropertyHandler.getInstance().getValue("instancesDropList");
		System.out.println(instancesDropList + "" + "//*[text()=' ']");
	}

}
