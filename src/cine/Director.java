package cine;

public class Director {
    private String _nombre;
    private String _nacionalidad;


    public Director(String _nombre, String _nacionalidad) {
        this._nombre = _nombre;
        this._nacionalidad = _nacionalidad;
    }

    public String get_nombre() {
        return _nombre;
    }

    public String get_nacionalidad() {
        return _nacionalidad;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public void set_nacionalidad(String _nacionalidad) {
        this._nacionalidad = _nacionalidad;
    }
}
