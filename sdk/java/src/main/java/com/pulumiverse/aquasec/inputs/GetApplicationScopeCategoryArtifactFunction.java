// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumiverse.aquasec.inputs.GetApplicationScopeCategoryArtifactFunctionVariable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationScopeCategoryArtifactFunction extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationScopeCategoryArtifactFunction Empty = new GetApplicationScopeCategoryArtifactFunction();

    @Import(name="expression", required=true)
    private String expression;

    public String expression() {
        return this.expression;
    }

    @Import(name="variables")
    private @Nullable List<GetApplicationScopeCategoryArtifactFunctionVariable> variables;

    public Optional<List<GetApplicationScopeCategoryArtifactFunctionVariable>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private GetApplicationScopeCategoryArtifactFunction() {}

    private GetApplicationScopeCategoryArtifactFunction(GetApplicationScopeCategoryArtifactFunction $) {
        this.expression = $.expression;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationScopeCategoryArtifactFunction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationScopeCategoryArtifactFunction $;

        public Builder() {
            $ = new GetApplicationScopeCategoryArtifactFunction();
        }

        public Builder(GetApplicationScopeCategoryArtifactFunction defaults) {
            $ = new GetApplicationScopeCategoryArtifactFunction(Objects.requireNonNull(defaults));
        }

        public Builder expression(String expression) {
            $.expression = expression;
            return this;
        }

        public Builder variables(@Nullable List<GetApplicationScopeCategoryArtifactFunctionVariable> variables) {
            $.variables = variables;
            return this;
        }

        public Builder variables(GetApplicationScopeCategoryArtifactFunctionVariable... variables) {
            return variables(List.of(variables));
        }

        public GetApplicationScopeCategoryArtifactFunction build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            return $;
        }
    }

}
