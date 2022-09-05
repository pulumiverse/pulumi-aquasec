// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumiverse.aquasec.outputs.GetFirewallPolicyInboundNetwork;
import com.pulumiverse.aquasec.outputs.GetFirewallPolicyOutboundNetwork;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetFirewallPolicyResult {
    /**
     * @return Username of the account that created the policy.
     * 
     */
    private final String author;
    /**
     * @return Indicates whether policy includes blocking incoming &#39;ping&#39; requests.
     * 
     */
    private final Boolean blockIcmpPing;
    /**
     * @return Indicates whether policy includes blocking metadata services of the cloud.
     * 
     */
    private final Boolean blockMetadataService;
    /**
     * @return Description of the Firewall Policy.
     * 
     */
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Information on network addresses that are allowed to pass in data or requests.
     * 
     */
    private final List<GetFirewallPolicyInboundNetwork> inboundNetworks;
    /**
     * @return Timestamp of the last update in Unix time format.
     * 
     */
    private final Integer lastupdate;
    /**
     * @return Name of the policy, no longer than 128 characters and no slash characters.
     * 
     */
    private final String name;
    /**
     * @return Information on network addresses that are allowed to receive data or requests.
     * 
     */
    private final @Nullable List<GetFirewallPolicyOutboundNetwork> outboundNetworks;
    /**
     * @return Indicates the class of protection defined by the firewall.
     * 
     */
    private final String type;
    /**
     * @return Aqua version functionality supported
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetFirewallPolicyResult(
        @CustomType.Parameter("author") String author,
        @CustomType.Parameter("blockIcmpPing") Boolean blockIcmpPing,
        @CustomType.Parameter("blockMetadataService") Boolean blockMetadataService,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("inboundNetworks") List<GetFirewallPolicyInboundNetwork> inboundNetworks,
        @CustomType.Parameter("lastupdate") Integer lastupdate,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outboundNetworks") @Nullable List<GetFirewallPolicyOutboundNetwork> outboundNetworks,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") String version) {
        this.author = author;
        this.blockIcmpPing = blockIcmpPing;
        this.blockMetadataService = blockMetadataService;
        this.description = description;
        this.id = id;
        this.inboundNetworks = inboundNetworks;
        this.lastupdate = lastupdate;
        this.name = name;
        this.outboundNetworks = outboundNetworks;
        this.type = type;
        this.version = version;
    }

    /**
     * @return Username of the account that created the policy.
     * 
     */
    public String author() {
        return this.author;
    }
    /**
     * @return Indicates whether policy includes blocking incoming &#39;ping&#39; requests.
     * 
     */
    public Boolean blockIcmpPing() {
        return this.blockIcmpPing;
    }
    /**
     * @return Indicates whether policy includes blocking metadata services of the cloud.
     * 
     */
    public Boolean blockMetadataService() {
        return this.blockMetadataService;
    }
    /**
     * @return Description of the Firewall Policy.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Information on network addresses that are allowed to pass in data or requests.
     * 
     */
    public List<GetFirewallPolicyInboundNetwork> inboundNetworks() {
        return this.inboundNetworks;
    }
    /**
     * @return Timestamp of the last update in Unix time format.
     * 
     */
    public Integer lastupdate() {
        return this.lastupdate;
    }
    /**
     * @return Name of the policy, no longer than 128 characters and no slash characters.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Information on network addresses that are allowed to receive data or requests.
     * 
     */
    public List<GetFirewallPolicyOutboundNetwork> outboundNetworks() {
        return this.outboundNetworks == null ? List.of() : this.outboundNetworks;
    }
    /**
     * @return Indicates the class of protection defined by the firewall.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Aqua version functionality supported
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String author;
        private Boolean blockIcmpPing;
        private Boolean blockMetadataService;
        private String description;
        private String id;
        private List<GetFirewallPolicyInboundNetwork> inboundNetworks;
        private Integer lastupdate;
        private String name;
        private @Nullable List<GetFirewallPolicyOutboundNetwork> outboundNetworks;
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.author = defaults.author;
    	      this.blockIcmpPing = defaults.blockIcmpPing;
    	      this.blockMetadataService = defaults.blockMetadataService;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.inboundNetworks = defaults.inboundNetworks;
    	      this.lastupdate = defaults.lastupdate;
    	      this.name = defaults.name;
    	      this.outboundNetworks = defaults.outboundNetworks;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder author(String author) {
            this.author = Objects.requireNonNull(author);
            return this;
        }
        public Builder blockIcmpPing(Boolean blockIcmpPing) {
            this.blockIcmpPing = Objects.requireNonNull(blockIcmpPing);
            return this;
        }
        public Builder blockMetadataService(Boolean blockMetadataService) {
            this.blockMetadataService = Objects.requireNonNull(blockMetadataService);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder inboundNetworks(List<GetFirewallPolicyInboundNetwork> inboundNetworks) {
            this.inboundNetworks = Objects.requireNonNull(inboundNetworks);
            return this;
        }
        public Builder inboundNetworks(GetFirewallPolicyInboundNetwork... inboundNetworks) {
            return inboundNetworks(List.of(inboundNetworks));
        }
        public Builder lastupdate(Integer lastupdate) {
            this.lastupdate = Objects.requireNonNull(lastupdate);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outboundNetworks(@Nullable List<GetFirewallPolicyOutboundNetwork> outboundNetworks) {
            this.outboundNetworks = outboundNetworks;
            return this;
        }
        public Builder outboundNetworks(GetFirewallPolicyOutboundNetwork... outboundNetworks) {
            return outboundNetworks(List.of(outboundNetworks));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetFirewallPolicyResult build() {
            return new GetFirewallPolicyResult(author, blockIcmpPing, blockMetadataService, description, id, inboundNetworks, lastupdate, name, outboundNetworks, type, version);
        }
    }
}
