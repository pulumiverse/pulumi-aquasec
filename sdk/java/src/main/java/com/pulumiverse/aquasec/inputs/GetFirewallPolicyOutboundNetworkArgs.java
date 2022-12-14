// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetFirewallPolicyOutboundNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetFirewallPolicyOutboundNetworkArgs Empty = new GetFirewallPolicyOutboundNetworkArgs();

    /**
     * Indicates whether the specified resources are allowed to receive data or requests.
     * 
     */
    @Import(name="allow", required=true)
    private Output<Boolean> allow;

    /**
     * @return Indicates whether the specified resources are allowed to receive data or requests.
     * 
     */
    public Output<Boolean> allow() {
        return this.allow;
    }

    /**
     * Range of ports affected by firewall.
     * 
     */
    @Import(name="portRange", required=true)
    private Output<String> portRange;

    /**
     * @return Range of ports affected by firewall.
     * 
     */
    public Output<String> portRange() {
        return this.portRange;
    }

    /**
     * Information of the resource.
     * 
     */
    @Import(name="resource", required=true)
    private Output<String> resource;

    /**
     * @return Information of the resource.
     * 
     */
    public Output<String> resource() {
        return this.resource;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }

    private GetFirewallPolicyOutboundNetworkArgs() {}

    private GetFirewallPolicyOutboundNetworkArgs(GetFirewallPolicyOutboundNetworkArgs $) {
        this.allow = $.allow;
        this.portRange = $.portRange;
        this.resource = $.resource;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFirewallPolicyOutboundNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFirewallPolicyOutboundNetworkArgs $;

        public Builder() {
            $ = new GetFirewallPolicyOutboundNetworkArgs();
        }

        public Builder(GetFirewallPolicyOutboundNetworkArgs defaults) {
            $ = new GetFirewallPolicyOutboundNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allow Indicates whether the specified resources are allowed to receive data or requests.
         * 
         * @return builder
         * 
         */
        public Builder allow(Output<Boolean> allow) {
            $.allow = allow;
            return this;
        }

        /**
         * @param allow Indicates whether the specified resources are allowed to receive data or requests.
         * 
         * @return builder
         * 
         */
        public Builder allow(Boolean allow) {
            return allow(Output.of(allow));
        }

        /**
         * @param portRange Range of ports affected by firewall.
         * 
         * @return builder
         * 
         */
        public Builder portRange(Output<String> portRange) {
            $.portRange = portRange;
            return this;
        }

        /**
         * @param portRange Range of ports affected by firewall.
         * 
         * @return builder
         * 
         */
        public Builder portRange(String portRange) {
            return portRange(Output.of(portRange));
        }

        /**
         * @param resource Information of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resource(Output<String> resource) {
            $.resource = resource;
            return this;
        }

        /**
         * @param resource Information of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resource(String resource) {
            return resource(Output.of(resource));
        }

        /**
         * @param resourceType Type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType Type of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public GetFirewallPolicyOutboundNetworkArgs build() {
            $.allow = Objects.requireNonNull($.allow, "expected parameter 'allow' to be non-null");
            $.portRange = Objects.requireNonNull($.portRange, "expected parameter 'portRange' to be non-null");
            $.resource = Objects.requireNonNull($.resource, "expected parameter 'resource' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
