// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallPolicyOutboundNetwork extends com.pulumi.resources.InvokeArgs {

    public static final GetFirewallPolicyOutboundNetwork Empty = new GetFirewallPolicyOutboundNetwork();

    /**
     * Indicates whether the specified resources are allowed to receive data or requests.
     * 
     */
    @Import(name="allow", required=true)
    private Boolean allow;

    /**
     * @return Indicates whether the specified resources are allowed to receive data or requests.
     * 
     */
    public Boolean allow() {
        return this.allow;
    }

    /**
     * Range of ports affected by firewall.
     * 
     */
    @Import(name="portRange", required=true)
    private String portRange;

    /**
     * @return Range of ports affected by firewall.
     * 
     */
    public String portRange() {
        return this.portRange;
    }

    /**
     * Information of the resource.
     * 
     */
    @Import(name="resource", required=true)
    private String resource;

    /**
     * @return Information of the resource.
     * 
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="resourceType", required=true)
    private String resourceType;

    /**
     * @return Type of the resource.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }

    private GetFirewallPolicyOutboundNetwork() {}

    private GetFirewallPolicyOutboundNetwork(GetFirewallPolicyOutboundNetwork $) {
        this.allow = $.allow;
        this.portRange = $.portRange;
        this.resource = $.resource;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallPolicyOutboundNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallPolicyOutboundNetwork $;

        public Builder() {
            $ = new GetFirewallPolicyOutboundNetwork();
        }

        public Builder(GetFirewallPolicyOutboundNetwork defaults) {
            $ = new GetFirewallPolicyOutboundNetwork(Objects.requireNonNull(defaults));
        }

        /**
         * @param allow Indicates whether the specified resources are allowed to receive data or requests.
         * 
         * @return builder
         * 
         */
        public Builder allow(Boolean allow) {
            $.allow = allow;
            return this;
        }

        /**
         * @param portRange Range of ports affected by firewall.
         * 
         * @return builder
         * 
         */
        public Builder portRange(String portRange) {
            $.portRange = portRange;
            return this;
        }

        /**
         * @param resource Information of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resourceType Type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public GetFirewallPolicyOutboundNetwork build() {
            $.allow = Objects.requireNonNull($.allow, "expected parameter 'allow' to be non-null");
            $.portRange = Objects.requireNonNull($.portRange, "expected parameter 'portRange' to be non-null");
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
