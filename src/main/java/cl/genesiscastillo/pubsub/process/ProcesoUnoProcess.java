package cl.genesiscastillo.pubsub.process;

import java.time.LocalTime;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcesoUnoProcess  implements Processor	{

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setBody("HOLA "+LocalTime.now());
	}
	

}
