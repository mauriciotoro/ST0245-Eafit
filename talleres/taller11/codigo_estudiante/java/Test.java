import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Prueba las implementaciones de DigraphAL y DigraphAM con el grafo del
 * documento.
 * 
 * Ejecute esta clase luego de completar las clases DigraphAL y DigraphAM para
 * tener una idea de si su implementaci�n est� correcta.
 * 
 * @author Camilo Paez
 */
public class Test {
	static final int SIZE = 12;
	static HashSet<Pair<Integer, Integer>> edges;
	static ArrayList<Pair<Integer, Integer>> caminos;
	static int[] sinEntradas = { 0, 1, 3, 4, 5, 6, 7 };

	public static void main(String[] args) {
		edges = fillEdges();

		DigraphAM gMatrix = new DigraphAM(SIZE);
		fillGraph(gMatrix);
		System.out.println("DigraphAM (Matriz de Adyacencia):");
		System.out.println("    getWeight() -> " + convert(testWeight(gMatrix)));
		System.out.println("    getSuccesors() -> " + convert(testSuccesors(gMatrix)));

		DigraphAL gList = new DigraphAL(SIZE);
		fillGraph(gList);
		System.out.println("DigraphAL (Listas de Adyacencia):");
		System.out.println("    getWeight() -> " + convert(testWeight(gList)));
		System.out.println("    getSuccesors() -> " + convert(testSuccesors(gList)));


	}

	static HashSet<Pair<Integer, Integer>> fillEdges() {
		HashSet<Pair<Integer, Integer>> edges = new HashSet<>();
		edges.add(Pair.makePair(3, 8));
		edges.add(Pair.makePair(3, 10));
		edges.add(Pair.makePair(5, 11));
		edges.add(Pair.makePair(7, 8));
		edges.add(Pair.makePair(7, 11));
		edges.add(Pair.makePair(8, 9));
		edges.add(Pair.makePair(11, 2));
		edges.add(Pair.makePair(11, 9));
		edges.add(Pair.makePair(11, 10));
		return edges;
	}

	static boolean fillGraph(Digraph g) {
		if (edges == null || g == null)
			return false;
		for (Pair<Integer, Integer> p : edges)
			g.addArc(p.first, p.second, 1);
		return true;
	}

	static boolean testWeight(Digraph g) {
		int w;
		for (int i = 0; i < SIZE; ++i)
			for (int j = 0; j < SIZE; ++j) {
				w = g.getWeight(i, j);
				if (edges.contains(Pair.makePair(i, j))) {
					if (w != 1)
						return false;
				} else {
					if (w != 0)
						return false;
				}
			}
		return true;
	}

	static boolean testSuccesors(Digraph g) {
		if (g.getSuccessors(0) != null)
			return false;
		if (g.getSuccessors(1) != null)
			return false;
		if (g.getSuccessors(2) != null)
			return false;
		if (!g.getSuccessors(3).equals(new ArrayList<Integer>(Arrays.asList(8, 10))))
			return false;
		if (g.getSuccessors(4) != null)
			return false;
		if (!g.getSuccessors(5).equals(new ArrayList<Integer>(Arrays.asList(11))))
			return false;
		if (g.getSuccessors(6) != null)
			return false;
		if (!g.getSuccessors(7).equals(new ArrayList<Integer>(Arrays.asList(8, 11))))
			return false;
		if (!g.getSuccessors(8).equals(new ArrayList<Integer>(Arrays.asList(9))))
			return false;
		if (g.getSuccessors(9) != null)
			return false;
		if (g.getSuccessors(10) != null)
			return false;
		if (!g.getSuccessors(11).equals(new ArrayList<Integer>(Arrays.asList(2, 9, 10))))
			return false;
		return true;
	}



	private static ArrayList<Pair<Integer, Integer>> fillCaminos() {
		ArrayList<Pair<Integer, Integer>> caminos = new ArrayList<>();
		caminos.add(Pair.makePair(7, 8));
		caminos.add(Pair.makePair(7, 11));
		caminos.add(Pair.makePair(7, 2));
		caminos.add(Pair.makePair(7, 9));
		caminos.add(Pair.makePair(7, 10));
		caminos.add(Pair.makePair(3, 8));
		caminos.add(Pair.makePair(3, 9));
		caminos.add(Pair.makePair(3, 10));
		caminos.add(Pair.makePair(8, 9));
		caminos.add(Pair.makePair(11, 2));
		caminos.add(Pair.makePair(11, 9));
		caminos.add(Pair.makePair(11, 10));
		caminos.add(Pair.makePair(5, 11));
		caminos.add(Pair.makePair(5, 2));
		caminos.add(Pair.makePair(5, 9));
		caminos.add(Pair.makePair(5, 10));
		return caminos;
	}




	static String convert(boolean b) {
		return b ? "correcta" : "incorrecta";
	}

}
