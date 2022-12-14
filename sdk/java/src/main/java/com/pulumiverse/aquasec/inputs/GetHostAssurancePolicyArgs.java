// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHostAssurancePolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHostAssurancePolicyArgs Empty = new GetHostAssurancePolicyArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private GetHostAssurancePolicyArgs() {}

    private GetHostAssurancePolicyArgs(GetHostAssurancePolicyArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHostAssurancePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHostAssurancePolicyArgs $;

        public Builder() {
            $ = new GetHostAssurancePolicyArgs();
        }

        public Builder(GetHostAssurancePolicyArgs defaults) {
            $ = new GetHostAssurancePolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetHostAssurancePolicyArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
