//Nota: Hacen falta algunas partes de las lineas de codigo, estas estan indicadas con una linea, ¡debes completarlas!
public class Fecha {
    int dia, mes, anio;

    public Fecha(int dia, int mes, int anio) {
        ___.dia = dia;
        ___.mes = mes;
        ___.anio = anio;
    }

    public int dia() {
        return this.dia;
    }

    public int mes() {
        return this.mes;
    }

    public int anio() {
        return this.anio;
    }

    // -1 si esta fecha es anterior a la otra
    // 0 si son iguales
    // 1 si esta fecha es posterior a la otra
    public int comparar(Fecha otra) {
        if (this.anio ___ otra.anio)
            return -1;
        if (this.anio > otra.anio)
            return 1;

        if (this.mes ___ otra.mes)
            return -1;
        if (this.mes > otra.mes)
            return 1;

        if (this.dia < otra.dia)
            return -1;
        if (this.dia ___ otra.dia)
            return 1;

        return ____;
    }

    public String toString() {
        return ___________;
    }
}
