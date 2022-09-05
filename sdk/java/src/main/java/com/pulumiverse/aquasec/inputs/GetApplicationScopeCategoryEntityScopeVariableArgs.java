// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationScopeCategoryEntityScopeVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetApplicationScopeCategoryEntityScopeVariableArgs Empty = new GetApplicationScopeCategoryEntityScopeVariableArgs();

    @Import(name="attribute", required=true)
    private Output<String> attribute;

    public Output<String> attribute() {
        return this.attribute;
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private GetApplicationScopeCategoryEntityScopeVariableArgs() {}

    private GetApplicationScopeCategoryEntityScopeVariableArgs(GetApplicationScopeCategoryEntityScopeVariableArgs $) {
        this.attribute = $.attribute;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationScopeCategoryEntityScopeVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationScopeCategoryEntityScopeVariableArgs $;

        public Builder() {
            $ = new GetApplicationScopeCategoryEntityScopeVariableArgs();
        }

        public Builder(GetApplicationScopeCategoryEntityScopeVariableArgs defaults) {
            $ = new GetApplicationScopeCategoryEntityScopeVariableArgs(Objects.requireNonNull(defaults));
        }

        public Builder attribute(Output<String> attribute) {
            $.attribute = attribute;
            return this;
        }

        public Builder attribute(String attribute) {
            return attribute(Output.of(attribute));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GetApplicationScopeCategoryEntityScopeVariableArgs build() {
            $.attribute = Objects.requireNonNull($.attribute, "expected parameter 'attribute' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
