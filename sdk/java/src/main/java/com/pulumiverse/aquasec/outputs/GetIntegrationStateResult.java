// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIntegrationStateResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return OIDCSettings enabled status
     * 
     */
    private Boolean oidcSettings;
    /**
     * @return OpenIdSettings enabled status
     * 
     */
    private Boolean openidSettings;
    /**
     * @return SAMLSettings enabled status
     * 
     */
    private Boolean samlSettings;

    private GetIntegrationStateResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return OIDCSettings enabled status
     * 
     */
    public Boolean oidcSettings() {
        return this.oidcSettings;
    }
    /**
     * @return OpenIdSettings enabled status
     * 
     */
    public Boolean openidSettings() {
        return this.openidSettings;
    }
    /**
     * @return SAMLSettings enabled status
     * 
     */
    public Boolean samlSettings() {
        return this.samlSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationStateResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Boolean oidcSettings;
        private Boolean openidSettings;
        private Boolean samlSettings;
        public Builder() {}
        public Builder(GetIntegrationStateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.oidcSettings = defaults.oidcSettings;
    	      this.openidSettings = defaults.openidSettings;
    	      this.samlSettings = defaults.samlSettings;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder oidcSettings(Boolean oidcSettings) {
            this.oidcSettings = Objects.requireNonNull(oidcSettings);
            return this;
        }
        @CustomType.Setter
        public Builder openidSettings(Boolean openidSettings) {
            this.openidSettings = Objects.requireNonNull(openidSettings);
            return this;
        }
        @CustomType.Setter
        public Builder samlSettings(Boolean samlSettings) {
            this.samlSettings = Objects.requireNonNull(samlSettings);
            return this;
        }
        public GetIntegrationStateResult build() {
            final var o = new GetIntegrationStateResult();
            o.id = id;
            o.oidcSettings = oidcSettings;
            o.openidSettings = openidSettings;
            o.samlSettings = samlSettings;
            return o;
        }
    }
}
