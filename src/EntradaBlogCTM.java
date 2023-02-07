
/**
 * Clase para manejar las entradas de un blog.
 *
 * @author Christian Torrecillas
 * @version 2.4
 * @since 21/3/1993
 */
public class EntradaBlogCTM {

        /**
         * separador es el ccarácter que separa ENTRADA DE del
         * texto: devuelve el texto que introduces en el contrustuctor parametrizado.
         * autor: nombre del autor
         */
        public static char separador=':';
        private int id;
        private String texto;
        private String autor;


        /**
         * Constructor de la clase. recibe el número de entrada, el nombre del autor
         * de la entrada y el texto que contiene la entrada. Si el número de entrada
         * es negativo, lanza una excepción.
         *
         * @param id
         * @param autor
         * @param texto
         * @throws IllegalArgumentException
         */
        public EntradaBlogCTM(int id,String autor,String texto)throws IllegalArgumentException{
                if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
                        this.id=id;
                        this.autor=autor;
                        this.texto=texto;
        }

        /**
         *
         * @return Devuelve los paramatros de los atributos de la clase. Creando un nuevo String cad
         * en el cual vamos añadiendo los nuevos datos a introducir.
         *
         */
        @Override
        public String toString(){
                String cad="";
                cad+="\nENTRADA DE"+separador+autor;
                cad+="\n "+texto;
                return cad;
        }



        /**
         *
         * @return Devuelve el id de la entrada en formato int.
         */
        public int getId(){
                return this.id;
        }



        /**
         *
         * @return Devuelve el texto completo de la entrada
         */
        public String getTexto(){
                return this.texto;
        }



        /**
         *
         * @return Devuelve el nombre del autor de la entrada en mayúsculas.
         */
        public String getAutor(){
                return this.autor.toUpperCase();
        }

        /**
         *
         * @return Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
         */
        public String devuelveAutor(){
                return this.autor;
        }

        /**
         * Clase main del programa.
         *
         * @param args No tiene porqué tener argumentos.
         */
        public static void main(String[] args) {
                /**
                 * Inicilización de un objeto EntradaBlogCTM y parametrización en su constructor.
                 */
                EntradaBlogCTM e1=new EntradaBlogCTM (3,"Christian","Últimas noticias, está disponible BixBy 2.0");
                /**
                 * Muestra por pantalla el objeto de clase EntradaBlogCTM usando el método toString.
                 */
                System.out.println(e1);
        }
}