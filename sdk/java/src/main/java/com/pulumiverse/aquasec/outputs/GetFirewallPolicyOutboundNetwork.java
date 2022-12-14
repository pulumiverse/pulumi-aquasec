// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirewallPolicyOutboundNetwork {
    /**
     * @return Indicates whether the specified resources are allowed to receive data or requests.
     * 
     */
    private Boolean allow;
    /**
     * @return Range of ports affected by firewall.
     * 
     */
    private String portRange;
    /**
     * @return Information of the resource.
     * 
     */
    private String resource;
    /**
     * @return Type of the resource.
     * 
     */
    private String resourceType;

    private GetFirewallPolicyOutboundNetwork() {}
    /**
     * @return Indicates whether the specified resources are allowed to receive data or requests.
     * 
     */
    public Boolean allow() {
        return this.allow;
    }
    /**
     * @return Range of ports affected by firewall.
     * 
     */
    public String portRange() {
        return this.portRange;
    }
    /**
     * @return Information of the resource.
     * 
     */
    public String resource() {
        return this.resource;
    }
    /**
     * @return Type of the resource.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyOutboundNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allow;
        private String portRange;
        private String resource;
        private String resourceType;
        public Builder() {}
        public Builder(GetFirewallPolicyOutboundNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.portRange = defaults.portRange;
    	      this.resource = defaults.resource;
    	      this.resourceType = defaults.resourceType;
        }

        @CustomType.Setter
        public Builder allow(Boolean allow) {
            this.allow = Objects.requireNonNull(allow);
            return this;
        }
        @CustomType.Setter
        public Builder portRange(String portRange) {
            this.portRange = Objects.requireNonNull(portRange);
            return this;
        }
        @CustomType.Setter
        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public GetFirewallPolicyOutboundNetwork build() {
            final var o = new GetFirewallPolicyOutboundNetwork();
            o.allow = allow;
            o.portRange = portRange;
            o.resource = resource;
            o.resourceType = resourceType;
            return o;
        }
    }
}
