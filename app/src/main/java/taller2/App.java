/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */

     public static int Calcular_saldo(int base_dinero, int recaudo_total, int retiros_total){

        try {
            
            final int base_mont_min = 2000000;
            int saldo_taquilla = 0; 

            if(base_dinero < base_mont_min || base_dinero > base_mont_min){
                return -1;
            }

            saldo_taquilla = base_dinero + recaudo_total - retiros_total;
            return saldo_taquilla;

        } 
        
        catch (Exception e) {
            return -1;
        }

     }

    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */

     public static String Calcular_tip(float valor_consumo){

        try {
         
            final float porcen_propina = 0.1f, imp_consumo = 0.08f;
            final byte k_cero = 0;
            float total_pagar = 0, total_propina = 0, total_impuesto = 0;
            String msg_final = "";

            if(valor_consumo <= k_cero){
                return "Error calculando consumo";
            }

            total_propina = valor_consumo * porcen_propina;
            total_impuesto = valor_consumo * imp_consumo;
            total_pagar = valor_consumo + total_propina + total_impuesto;

            msg_final = "valor comida: $" + valor_consumo + " - valor propina $" + total_propina +
            " - valor impoconsumo $" + total_impuesto + " - total a pagar $" + total_pagar;

            return msg_final;

        } 
        
        catch (Exception e) {
            return "Error en la función Calcular_tip";
        }

     }

    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */

     public static int Obtener_puntos(int part_ganados, int part_perdidos, int part_empatados){

        try {

            final byte punt_ganar = 3, punt_perder = 0, punt_empatar = 1, k_cero = 0;
            int punt_totales = 0, punt_partidos_ganar = 0, punt_partidos_empate = 0, 
            punt_partidos_perder = 0;

            if(part_ganados < k_cero || part_perdidos < k_cero || part_empatados < k_cero){
                return -1;
            }
            
            punt_partidos_ganar = part_ganados * punt_ganar;
            punt_partidos_empate = part_empatados * punt_empatar;
            punt_partidos_perder = part_perdidos * punt_perder;
            
            punt_totales = punt_partidos_ganar + punt_partidos_empate + punt_partidos_perder;
            return punt_totales;
            
        } 
        
        catch (Exception e) {
            return -1;
        }

     }

    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */

     public static float Calcular_definitiva(float n1, float n2, float n3, float n4, float n5, 
     float porcen1, float porcen2, float porcen3, float porcen4, float porcen5){

        try {
          
            final byte nota_min = 0, nota_max = 5, porcen_min = 0, porcen_max = 1;
            float nota_definitiva = 0, suma_porcen = 0;

            if(n1 < nota_min || n1 > nota_max){
                return -1;
            }
            else if(n2 < nota_min || n2 > nota_max){
                return -1;
            }
            else if(n3 < nota_min || n3 > nota_max){
                return -1;
            }
            else if(n4 < nota_min || n4 > nota_max){
                return -1;
            }
            else if(n5 < nota_min || n5 > nota_max){
                return -1;
            }


            if(porcen1 < porcen_min || porcen1 > porcen_max){
                return -1;
            }
            else if(porcen2 < porcen_min || porcen2 > porcen_max){
                return -1;
            }
            else if(porcen3 < porcen_min || porcen3 > porcen_max){
                return -1;
            }
            else if(porcen4 < porcen_min || porcen4 > porcen_max){
                return -1;
            }
            else if(porcen5 < porcen_min || porcen5 > porcen_max){
                return -1;
            }


            suma_porcen = porcen1 + porcen2 + porcen3 + porcen4 + porcen5;
            if(suma_porcen != 1){
                return -1;
            }

            nota_definitiva = (n1 * porcen1) + (n2 * porcen2) + (n3 * porcen3)
            + (n4 *porcen4) + (n5 * porcen5);
            return nota_definitiva;

        } 
        
        catch (Exception e) {
            return -1;
        }

     }

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */

     public static float Calcular_para_ganar(float n1, float n2, float n3, float n4, 
     float porcen1, float porcen2, float porcen3, float porcen4, float porcen5){

        try {
          
        final byte nota_min = 0, nota_max = 5, porcen_min = 0, porcen_max = 1, nota_para_ganar = 3;
        float nota_requerida = 0, suma_porcen = 0, nota_parcial = 0;

        if(porcen1 < porcen_min || porcen1 > porcen_max){
            return -1;
        }
        else if(porcen2 < porcen_min || porcen2 > porcen_max){
            return -1;
        }
        else if(porcen3 < porcen_min || porcen3 > porcen_max){
            return -1;
        }
        else if(porcen4 < porcen_min || porcen4 > porcen_max){
            return -1;
        }
        else if(porcen5 < porcen_min || porcen5 > porcen_max){
            return -1;
        }

            suma_porcen = porcen1 + porcen2 + porcen3 + porcen4 + porcen5;
                if(suma_porcen != 1){
                    return -1;
                }

        if(n1 < nota_min || n1 > nota_max){
            return -1;
        }
        else if(n2 < nota_min || n2 > nota_max){
            return -1;
        }
        else if(n3 < nota_min || n3 > nota_max){
            return -1;
        }
        else if(n4 < nota_min || n4 > nota_max){
            return -1;
        }

        nota_parcial = (n1 * porcen1) + (n2 * porcen2) + (n3 * porcen3) + (n4 * porcen4);
        nota_requerida = (nota_para_ganar - nota_parcial) / porcen5;

        if(nota_requerida < nota_min || nota_requerida > nota_max){
            return -1;
        }
        
        return nota_requerida;
        
        } 
        
        catch (Exception e) {
            return -1;
        }
        
     }
    
    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_salario(int horas_normal, int horas_extra_diu, int horas_extra_not, 
     float var_hora_normal){

        try {
            
            final float porcen_diu = 0.15f, porcen_noc = 0.35f;
            final byte k_cero = 0;
            float salario_total = 0, pago_hrs_norm = 0, pago_hrs_diu = 0,
            pago_hrs_noc = 0;

            if(var_hora_normal <= k_cero){
                return -1;
            }

            pago_hrs_noc = horas_extra_not * var_hora_normal * porcen_noc;
            pago_hrs_diu = horas_extra_diu *  var_hora_normal * porcen_diu;
            pago_hrs_norm = var_hora_normal * horas_normal;
            salario_total = pago_hrs_norm + pago_hrs_diu + pago_hrs_noc;

            return salario_total;
    
        } 
        catch (Exception e) {
            return -1;
        }

     }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_area_triangulo(float base_trian, float altura_trian){

        try {
            
            final float k_area = 0.5f;
            final byte k_cero = 0;
            float area_triangulo = 0;
            
            if(base_trian <= k_cero || altura_trian <= k_cero){
                return -1;
            }

            area_triangulo = k_area * base_trian * altura_trian;
            return area_triangulo;

        } 
        
        catch (Exception e) {
            return -1;
        }

     }

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_perimetro_cuadrado(float lado_cuadrado){

        try {
            
            final float k_perimetro = 4.0f;
            final byte k_cero = 0;
            float perimetro_cuadrado = 0;

            if(lado_cuadrado <= k_cero){
                return -1;
            }

            perimetro_cuadrado = lado_cuadrado * k_perimetro;
            return perimetro_cuadrado;

        } 
        
        catch (Exception e) {
            return -1;
        }

     }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_volumen_cilindro(float radio_base, float altura_cilin){

        try {
            
            final float pi = 3.1415927f;
            final byte k_cero = 0, k_exponente = 2;
            float volumen_cilindro = 0;

            if(radio_base <= k_cero || altura_cilin <= k_cero){
                return -1;
            }

            volumen_cilindro = pi * (float)Math.pow(radio_base, k_exponente) * altura_cilin;
            return volumen_cilindro;

        } 
        
        catch (Exception e) {
            return -1;
        }

     }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

     public static float Calcular_area_circulo(float radio_circ){

        try {
           
            final float pi = 3.1415927f;
            final byte k_cero = 0, k_exponente = 2;
            float area_circulo = 0;

            if(radio_circ <= k_cero){
                return -1;
            }

            area_circulo = pi * (float)Math.pow(radio_circ, k_exponente);
            return area_circulo;

        } 
        
        catch (Exception e) {
            return -1;
        }

     }


}
