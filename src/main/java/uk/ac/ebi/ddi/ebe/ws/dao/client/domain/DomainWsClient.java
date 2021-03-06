package uk.ac.ebi.ddi.ebe.ws.dao.client.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.ebi.ddi.ebe.ws.dao.client.EbeyeClient;
import uk.ac.ebi.ddi.ebe.ws.dao.config.AbstractEbeyeWsConfig;
import uk.ac.ebi.ddi.ebe.ws.dao.model.domain.DomainList;

/**
 * This class contain all the methods related with the domain queries, including the number of entries, etc.
 *
 * @author ypriverol
 */
public class DomainWsClient extends EbeyeClient {

    private static final Logger logger = LoggerFactory.getLogger(DomainWsClient.class);
    /**
     * Default constructor for Ws clients
     *
     * @param config
     */
    public DomainWsClient(AbstractEbeyeWsConfig config) {
        super(config);
    }

    /**
     * Returns the domain details for an specific domainName
     * @param domainName domain Name
     * @return domain information
     */
    public DomainList getDomainByName(String domainName){

        String url = String.format("%s://%s/ebisearch/ws/rest/%s?format=JSON",
                config.getProtocol(), config.getHostName(), domainName);

        //Todo: Needs to be removed in the future, this is for debugging
        logger.debug(url);
        return this.restTemplate.getForObject(url, DomainList.class);
    }

}
