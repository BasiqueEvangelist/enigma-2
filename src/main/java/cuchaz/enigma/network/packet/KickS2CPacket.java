package cuchaz.enigma.network.packet;

import cuchaz.enigma.gui.GuiController;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class KickS2CPacket implements Packet<GuiController> {
	private String reason;

	KickS2CPacket() {
	}

	public KickS2CPacket(String reason) {
		this.reason = reason;
	}

	@Override
	public void read(DataInput input) throws IOException {
		this.reason = PacketHelper.readString(input);
	}

	@Override
	public void write(DataOutput output) throws IOException {
		PacketHelper.writeString(output, reason);
	}

	@Override
	public void handle(GuiController controller) {
		controller.disconnectIfConnected(reason);
	}
}
