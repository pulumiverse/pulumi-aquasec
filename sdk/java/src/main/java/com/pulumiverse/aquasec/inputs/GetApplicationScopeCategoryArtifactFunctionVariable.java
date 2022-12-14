// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationScopeCategoryArtifactFunctionVariable extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationScopeCategoryArtifactFunctionVariable Empty = new GetApplicationScopeCategoryArtifactFunctionVariable();

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

    private GetApplicationScopeCategoryArtifactFunctionVariable() {}

    private GetApplicationScopeCategoryArtifactFunctionVariable(GetApplicationScopeCategoryArtifactFunctionVariable $) {
        this.attribute = $.attribute;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationScopeCategoryArtifactFunctionVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationScopeCategoryArtifactFunctionVariable $;

        public Builder() {
            $ = new GetApplicationScopeCategoryArtifactFunctionVariable();
        }

        public Builder(GetApplicationScopeCategoryArtifactFunctionVariable defaults) {
            $ = new GetApplicationScopeCategoryArtifactFunctionVariable(Objects.requireNonNull(defaults));
        }

        public Builder attribute(String attribute) {
            $.attribute = attribute;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public GetApplicationScopeCategoryArtifactFunctionVariable build() {
            $.attribute = Objects.requireNonNull($.attribute, "expected parameter 'attribute' to be non-null");
            return $;
        }
    }

}
