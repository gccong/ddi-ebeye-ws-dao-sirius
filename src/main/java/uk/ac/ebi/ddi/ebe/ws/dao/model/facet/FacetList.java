package uk.ac.ebi.ddi.ebe.ws.dao.model.facet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import uk.ac.ebi.ddi.ebe.ws.dao.model.common.Facet;

/**
 * @author Yasset Perez-Riverol yperez@ebi.ac.uk
 */

@JsonIgnoreProperties(ignoreUnknown = true)

public class FacetList {

    @JsonProperty("hitCount")
    String hitCount = null;

    @JsonProperty("facets")
    Facet[] facets = null;

    public String getHitCount() {
        return hitCount;
    }

    public void setHitCount(String hitCount) {
        this.hitCount = hitCount;
    }

    public Facet[] getFacets() {
        return facets;
    }

    public void setFacets(Facet[] facets) {
        this.facets = facets;
    }
}
