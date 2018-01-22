
package clientews.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de calcularDistanciaResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="calcularDistanciaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace="calcularDistanciaResponse", name = "calcularDistanciaResponse", propOrder = {
    "_return"
})
public class CalcularDistanciaResponse {

    @XmlElement(name = "return")
    protected long _return;

    /**
     * Obtém o valor da propriedade return.
     * 
     */
    public long getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     */
    public void setReturn(long value) {
        this._return = value;
    }

}
