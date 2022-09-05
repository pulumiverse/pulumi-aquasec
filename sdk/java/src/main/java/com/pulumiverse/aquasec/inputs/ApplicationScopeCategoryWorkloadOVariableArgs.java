// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationScopeCategoryWorkloadOVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationScopeCategoryWorkloadOVariableArgs Empty = new ApplicationScopeCategoryWorkloadOVariableArgs();

    @Import(name="attribute")
    private @Nullable Output<String> attribute;

    public Optional<Output<String>> attribute() {
        return Optional.ofNullable(this.attribute);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ApplicationScopeCategoryWorkloadOVariableArgs() {}

    private ApplicationScopeCategoryWorkloadOVariableArgs(ApplicationScopeCategoryWorkloadOVariableArgs $) {
        this.attribute = $.attribute;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationScopeCategoryWorkloadOVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationScopeCategoryWorkloadOVariableArgs $;

        public Builder() {
            $ = new ApplicationScopeCategoryWorkloadOVariableArgs();
        }

        public Builder(ApplicationScopeCategoryWorkloadOVariableArgs defaults) {
            $ = new ApplicationScopeCategoryWorkloadOVariableArgs(Objects.requireNonNull(defaults));
        }

        public Builder attribute(@Nullable Output<String> attribute) {
            $.attribute = attribute;
            return this;
        }

        public Builder attribute(String attribute) {
            return attribute(Output.of(attribute));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ApplicationScopeCategoryWorkloadOVariableArgs build() {
            return $;
        }
    }

}
