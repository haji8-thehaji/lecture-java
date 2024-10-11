public class Car {
    private Gear state = Parking.getInstance();
	public void setState(Gear state) {
		this.state = state;
	}
	public void Gearup() {
		state.Gearup(this);
	}

	public void Geardown() {
		state.Geardown(this);
	}

	public void Gearstay() {
		state.Gearstay(this);
	}
}