
package clientews.ws.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de calculaValorTotalDoPercursoResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="calculaValorTotalDoPercursoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace="calculaValorTotalDoPercursoResponse", name = "calculaValorTotalDoPercursoResponse", propOrder = {
    "_return"
})
public class CalculaValorTotalDoPercursoResponse {

    @XmlElement(name = "return")
    protected double _return;

    /**
     * Obt�m o valor da propriedade return.
     * 
     */
    public double getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     */
    public void setReturn(double value) {
        this._return = value;
    }

}
