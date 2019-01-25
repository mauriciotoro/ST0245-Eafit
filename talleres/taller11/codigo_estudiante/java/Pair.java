import java.util.Objects;

/**
 * Contenedor para dos objetos de cualquier tipo. Basada en la implementacion de
 * Android.
 *
 * @author Camilo Paez
 */
public class Pair<F, S> {
	public final F first;
	public final S second;

	/**
	 * Constructor de pares.
	 *
	 * @param first primer objeto del par.
	 * @param second segundo objeto del par.
	 */
	public Pair(F first, S second) {
		this.first = first;
		this.second = second;
	}

	/**
	 * Verifica si dos pares son equivalentes. Se comparan los objetos
	 * correspondientes uno a uno: first con first, second con second.
	 *
	 * @param o el par con el cual este par (this) sera verificado
	 * @return true (verdadero) si los objetos en cada 'componente' son
	 * equivalentes entre si.
	 */

	@Override
	public boolean equals(Object o) {
		
		if (!(o instanceof Pair)) {
			return false;
		}

		Pair<?, ?> p = (Pair<?, ?>) o;
		return Objects.equals(p.first, first) && Objects.equals(p.second, second);
	}

	/**
	 * Computa el hash del objeto en base al hash de cada objeto que contiene.
	 *
	 * @return hash del par.
	 */
	@Override
	public int hashCode() {
		int hashFirst = (first == null) ? 0 : first.hashCode();
		int hashSecond = (second == null) ? 0 : second.hashCode();
		return hashFirst ^ hashSecond;
	}

	@Override
	public String toString() {
		return "Pair{" + String.valueOf(first) + " " + String.valueOf(second) + "}";
	}

	/**
	 * Metodo utilitario para crear un par debidamente tipado. Se recomienda
	 * usar este en vez del constructor.
	 * 
	 * @param first  primer objeto del par.
	 * @param second segundo objeto del par.
	 * @return un par que contiene a 'a' y a 'b', y fue debidamente creado en
	 * base al tipo de objeto que estos son.
	 */
	public static <A, B> Pair<A, B> makePair(A a, B b) {
		return new Pair<A, B>(a, b);
	}

}
