// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationScopeCategoryWorkloadKuberneteVariable extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationScopeCategoryWorkloadKuberneteVariable Empty = new GetApplicationScopeCategoryWorkloadKuberneteVariable();

    @Import(name="attribute", required=true)
    private String attribute;

    public String attribute() {
        return this.attribute;
    }

    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private GetApplicationScopeCategoryWorkloadKuberneteVariable() {}

    private GetApplicationScopeCategoryWorkloadKuberneteVariable(GetApplicationScopeCategoryWorkloadKuberneteVariable $) {
        this.attribute = $.attribute;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationScopeCategoryWorkloadKuberneteVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationScopeCategoryWorkloadKuberneteVariable $;

        public Builder() {
            $ = new GetApplicationScopeCategoryWorkloadKuberneteVariable();
        }

        public Builder(GetApplicationScopeCategoryWorkloadKuberneteVariable defaults) {
            $ = new GetApplicationScopeCategoryWorkloadKuberneteVariable(Objects.requireNonNull(defaults));
        }

        public Builder attribute(String attribute) {
            $.attribute = attribute;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public GetApplicationScopeCategoryWorkloadKuberneteVariable build() {
            $.attribute = Objects.requireNonNull($.attribute, "expected parameter 'attribute' to be non-null");
            return $;
        }
    }

}
