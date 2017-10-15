package time;

import java.util.ArrayList;
import java.util.List;

public class TimeLista {
	private List<Time> listaTime = new ArrayList<Time>();

	public List<Time> getListaTime() {
		return this.listaTime;
	}

	public void setListaTime(List<Time> listaClube) {
		this.listaTime = listaClube;
	}

	public void adicionarTime(Time time) {
		this.listaTime.add(time);
	}

}
