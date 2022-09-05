// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallPolicyOutboundNetwork {
    /**
     * @return Indicates whether the specified resources are allowed to receive data or requests.
     * 
     */
    private final Boolean allow;
    /**
     * @return Range of ports affected by firewall.
     * 
     */
    private final String portRange;
    /**
     * @return Information of the resource.
     * 
     */
    private final @Nullable String resource;
    /**
     * @return Type of the resource.
     * 
     */
    private final String resourceType;

    @CustomType.Constructor
    private FirewallPolicyOutboundNetwork(
        @CustomType.Parameter("allow") Boolean allow,
        @CustomType.Parameter("portRange") String portRange,
        @CustomType.Parameter("resource") @Nullable String resource,
        @CustomType.Parameter("resourceType") String resourceType) {
        this.allow = allow;
        this.portRange = portRange;
        this.resource = resource;
        this.resourceType = resourceType;
    }

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
    public Optional<String> resource() {
        return Optional.ofNullable(this.resource);
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

    public static Builder builder(FirewallPolicyOutboundNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allow;
        private String portRange;
        private @Nullable String resource;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyOutboundNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.portRange = defaults.portRange;
    	      this.resource = defaults.resource;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder allow(Boolean allow) {
            this.allow = Objects.requireNonNull(allow);
            return this;
        }
        public Builder portRange(String portRange) {
            this.portRange = Objects.requireNonNull(portRange);
            return this;
        }
        public Builder resource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }        public FirewallPolicyOutboundNetwork build() {
            return new FirewallPolicyOutboundNetwork(allow, portRange, resource, resourceType);
        }
    }
}
