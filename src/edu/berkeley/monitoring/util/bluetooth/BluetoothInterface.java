package edu.berkeley.monitoring.util.bluetooth;

import java.util.ArrayList;

public interface BluetoothInterface {
	
	public void onFinishedScanning();	
	public void onObtainedOneUnpairedDevices(String nameAndAddress);
	public void onFinishedObtainingPairedDevices(ArrayList<Device> pairedDevices);
	public void onFinishObtainingUnpairedDevices(ArrayList<String> unpairedDeviceAddress);
	//public String pickDeviceToPairWith(String address);
}
