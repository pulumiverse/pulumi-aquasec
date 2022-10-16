// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationRegistryOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationRegistryOptionArgs Empty = new IntegrationRegistryOptionArgs();

    @Import(name="option")
    private @Nullable Output<String> option;

    public Optional<Output<String>> option() {
        return Optional.ofNullable(this.option);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private IntegrationRegistryOptionArgs() {}

    private IntegrationRegistryOptionArgs(IntegrationRegistryOptionArgs $) {
        this.option = $.option;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationRegistryOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRegistryOptionArgs $;

        public Builder() {
            $ = new IntegrationRegistryOptionArgs();
        }

        public Builder(IntegrationRegistryOptionArgs defaults) {
            $ = new IntegrationRegistryOptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder option(@Nullable Output<String> option) {
            $.option = option;
            return this;
        }

        public Builder option(String option) {
            return option(Output.of(option));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public IntegrationRegistryOptionArgs build() {
            return $;
        }
    }

}