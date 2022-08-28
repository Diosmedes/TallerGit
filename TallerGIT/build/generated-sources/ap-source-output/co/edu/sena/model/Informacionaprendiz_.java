package co.edu.sena.model;

import co.edu.sena.model.Entrada;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-26T11:58:29")
@StaticMetamodel(Informacionaprendiz.class)
public class Informacionaprendiz_ { 

    public static volatile SingularAttribute<Informacionaprendiz, Integer> cedulaaprendiz;
    public static volatile SingularAttribute<Informacionaprendiz, String> nombreficha;
    public static volatile SingularAttribute<Informacionaprendiz, String> nombreaprendiz;
    public static volatile CollectionAttribute<Informacionaprendiz, Entrada> entradaCollection;
    public static volatile SingularAttribute<Informacionaprendiz, Integer> fichaaprendiz;

}