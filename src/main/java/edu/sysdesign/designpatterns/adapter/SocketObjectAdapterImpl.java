package edu.sysdesign.designpatterns.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter{

	//Using Composition for adapter pattern
	private Socket socket = new Socket();

	@Override
	public Volt get120Volts() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volts() {
		Volt v = socket.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volts() {
		Volt v = socket.getVolt();
		return convertVolt(v, 40);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts() / i);
	}
}
