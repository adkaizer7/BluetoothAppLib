package edu.berkeley.monitoring.util.bluetooth;

import android.bluetooth.BluetoothDevice;

public class Device {
	BluetoothDevice device;
	
	public Device(BluetoothDevice dev)
	{
		device = dev;
	}
	
	public BluetoothDevice getBlutoothDevice(){
		return this.device;
	}
}
